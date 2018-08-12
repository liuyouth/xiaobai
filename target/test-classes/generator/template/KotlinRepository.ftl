package ${basePackage}.db

import ${basePackage}.model.base.${modelNameUpperCamel}
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

interface ${modelNameUpperCamel}Repository : CrudRepository<${modelNameUpperCamel}, Long> , PagingAndSortingRepository<${modelNameUpperCamel},Long> {

    //@Query("from UrlRecord u where u.type=:type")
    //fun findUrlRecord(@Param("type") type: String): List<${modelNameUpperCamel}>

    //fun findByNameLike(name:String ,page: Pageable):Page<${modelNameUpperCamel}>
    //fun findByTypeLike(type:String ,page: Pageable):Page<${modelNameUpperCamel}>
    //fun findByUser_id(id:Long ,page:Pageable):Page<${modelNameUpperCamel}>
    }
