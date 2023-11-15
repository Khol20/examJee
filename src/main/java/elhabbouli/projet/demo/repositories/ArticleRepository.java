package elhabbouli.projet.demo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import elhabbouli.projet.demo.entities.Article;
import elhabbouli.projet.demo.entities.Categorie;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long>{

	
	
	

}
