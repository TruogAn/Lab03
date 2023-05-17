package thuchanh3;
import java.util.Scanner;

public class product {
	private String productID;
	private String description;
	private double price;

public product() {
	this ("00000", "mo ta", 0);
}
public product (String productID, String description, double price) {
	super();
	this.productID = productID;
	this.price = price;
	this.description = description;
}
public void setproductID(String productID) {
	this.productID = productID;
}
public String getproductID() {
	return productID;
}
public void setprice(double price) {
	this.price = price;
}
public double getprice() {
	return price;
}
public void setdescription(String description){
	this.description = description;
}
public String getdescription() {
	return description;
}
public void Nhap() {
	System.out.println("Nhập vào mã của sản phẩm: ");
	setProductID(sc.nextLine());
	System.out.println("Nhập vào mô tả của .sản phẩm: ");
	setDescription(sc.nextline());
	System.out.println("Nhập vào giá tiền của sản phẩm: ");
	setPrice(sc.nextline());
}
public void Xuat() {
	System.out.println("Mã sản phẩm:"+ productID);
	System.out.println("Mô tả sản phẩm:"+description);
	System.out.println("Giá tiền:"+price);
}

@Override
public String toString() {
	return "product [productID=" + productID + ", price=" + price + ", description=" + description +"]";
}
}
