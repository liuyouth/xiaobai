package ${basePackage}.controller

import ${basePackage}.authorization.annotation.Authorization
import ${basePackage}.authorization.annotation.CurrentUser
import ${basePackage}.db.${modelNameUpperCamel}Repository
import ${basePackage}.model.entity.*
import ${basePackage}.model.base.RBuilder.seccess
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.util.StringUtils.isEmpty
import java.util.ArrayList
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import java.math.BigInteger

/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
class ${modelNameUpperCamel}Controller {
    @Autowired
    lateinit var repository: ${modelNameUpperCamel}Repository
    @Autowired
    @PersistenceContext
    lateinit var entityManager: EntityManager

    /**
     * @param user 当前登录人信息 无需客户端携带，只需要携带token即可。
     * @param likes 模糊查询数组，根据客户端传来
     *
     */
    @Authorization
    @GetMapping("/")
    fun list(@CurrentUser user: User,
             @RequestParam likes: Map<String, String>,
             @RequestParam(value = "name", defaultValue = "") name: String,
             @RequestParam(value = "type", defaultValue = "") type: String,
             @RequestParam(value = "page", defaultValue = "0") page: Int,
             @RequestParam(value = "size", defaultValue = "15") size: Int,
             @RequestParam(value = "sortField", defaultValue = "") filedName: String,
             @RequestParam(value = "sortOrder", defaultValue = "") sortOrder: String): PageResult<${modelNameUpperCamel}> {
    var likesc = likes
    if (likesc == null)
    likesc = HashMap()
    val userId = user.id
    val pageNum = if (page == 0) {
    0
    } else {
    page - 1
    }
    var filedNames: String = filedName
    if (isEmpty(filedName) || "null" == filedName)
    filedNames = "id"
    var sd = when (sortOrder) {
    "descend" -> Sort.Direction.DESC
    else -> Sort.Direction.ASC
    }

    var totalSql = getSql("select count(id) from `${tableName}`", userId, type, filedNames, name, likesc, sd, pageNum, size)
    var query = entityManager?.createNativeQuery(totalSql)
    val total = query.singleResult as BigInteger
    var allPage = (total.toInt() / 3)

    var sql = getSql("select * from `${tableName}`", userId, type, filedNames, name, likesc, sd, pageNum, size)
    var q = entityManager?.createNativeQuery(sql, ${modelNameUpperCamel}::class.java)
    var list: List<${modelNameUpperCamel}> = q.resultList.toList() as List<${modelNameUpperCamel}>

        return RBuilder.seccess(list, total.toLong(), allPage)

        }

        @GetMapping("/list")
        fun adminlist(

        @RequestParam(value = "page", defaultValue = "0") page: Int,
        @RequestParam(value = "limit", defaultValue = "15") size: Int): PageResult<${modelNameUpperCamel}> {

        val pageNum = if (page == 0) {
        0
        } else {
        page - 1
        }

        var totalSql = getSql("select count(id) from `${tableName}`", 0, "", "", "", HashMap(), Sort.Direction.DESC, pageNum, size)
        var query = entityManager?.createNativeQuery(totalSql)
        val total = query.singleResult as BigInteger
        var allPage = (total.toInt() / 3)

        var sql = getSql("select * from `${tableName}`", 0, "", "", "", HashMap(), Sort.Direction.DESC, pageNum, size)
        var q = entityManager?.createNativeQuery(sql, ${modelNameUpperCamel}::class.java)
        var list: List<${modelNameUpperCamel}> = q.resultList.toList() as List<${modelNameUpperCamel}>

            return RBuilder.seccess(list, total.toLong(), allPage)

            }

            //分页查询sql
            fun getSql(sqlte: String, userId: Long, type: String, filedNames: String, name: String, likes: Map<String, String>, sd: Sort.Direction, page: Int, size: Int): String {
            var sql = sqlte
            if (userId != 0L)
            sql += " where user_id =" + userId + " "


            if (!isEmpty(type))
            sql += " and type =" + type + " "
            if (!isEmpty(name))
            sql += " and name like %" + name + "% "

            likes.forEach { key, value ->
            sql += " and " + key + " like %" + value + "% "
            }

            if (!isEmpty(filedNames))
            sql += " order by " + filedNames + " " + sd

            sql += " limit " + page + "," + size
            println(sql)
            return sql
            }

            @Authorization
            @GetMapping("/{id}")
            fun getById(@CurrentUser user: User, @PathVariable("id") id: Long): ${modelNameUpperCamel} {
            return repository.findOne(id)
            }

            @Authorization
            @PostMapping("/")
            fun add(@CurrentUser user: User, @RequestBody body: ${modelNameUpperCamel}): Result<${modelNameUpperCamel}> {
            body.user = user
            return RBuilder.seccess(repository.save(body))
            }

            @Authorization
            @PutMapping("/")
            fun update(@CurrentUser user: User, @RequestBody body: ${modelNameUpperCamel}): ${modelNameUpperCamel} {
            body.user = user
            return repository.save(body)
            }

            @Authorization
            @DeleteMapping("/{id}")
            fun del(@CurrentUser user: User, @PathVariable("id") id: Long): Result<${modelNameUpperCamel}> {
                val body: ${modelNameUpperCamel} = repository.findOne(id)
                body.deleted = true
                return RBuilder.seccess(repository.save(body))
                // 采用逻辑删除
                //        return repository.delete(id)
            }

}

