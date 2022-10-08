
public class ProductDAOImpl implements ProductDAO
{

	public void addProduct() {
		
		System.out.println("This is the AddProduct");
		
	}

	public void viewProduct(ProductModel p) {
		
		System.out.println("This is view Product::"+p.getPname()+""+p.getPid());
		
	}

}
