package pe.cibertec.ecommerce.ApiProduct.entity;

@Entity
@Table(name="producto") // se usa porque no es igual a la tabla de sql
@Data 
public class Product {
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    @Column(name="idProducto")
    private Long id;
     @Column(name="nombreProducto")
    private String name;
    @Column(name="descripcion")
    private String description;
    @Column(name="precioUnitario")
    private SigDecimal uniPrice;
    @Column(name="imageUrl")
    private String imgUrl;
}
