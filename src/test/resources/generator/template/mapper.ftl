package ${basePackage}.dao;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.core.Mapper;
import java.util.List;

/**
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}Mapper extends Mapper<${modelNameUpperCamel}> {
     List<${modelNameUpperCamel}> findAllRely();
}
