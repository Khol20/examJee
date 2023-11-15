package elhabbouli.projet.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import elhabbouli.projet.demo.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long>{

	//@Query("SELECT * FROM Categorie c WHERE c.categorieParent.id = :id")
    //List<Categorie> getCategories(long id);

}
