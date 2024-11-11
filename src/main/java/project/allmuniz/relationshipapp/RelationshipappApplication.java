package project.allmuniz.relationshipapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "RelationshipApp",
				description = "API responsavel pela gestão de um aplicativo de relacionamento",
				version = "1"
		)
)
public class RelationshipappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationshipappApplication.class, args);
	}

}
