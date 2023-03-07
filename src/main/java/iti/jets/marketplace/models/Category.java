// default package
// Generated Mar 4, 2023, 11:48:59 PM by Hibernate Tools 6.0.0.Alpha3
package iti.jets.marketplace.models;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name="category"
    ,catalog="marketplacedb"
)
public class Category  implements java.io.Serializable {


     private Integer categoryId;
     private String categoryName;
     private Set<Product> products = new HashSet<Product>(0);

    public Category() {
    }

	
    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
    public Category(String categoryName, Set<Product> products) {
       this.categoryName = categoryName;
       this.products = products;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="categoryId", unique=true, nullable=false)
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="categoryName", nullable=false, length=45)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="category")
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}


