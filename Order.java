package thuchanh3;
import java.time.LocalDate;
import java.util.Scanner;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail lineItems;
	private int count;
	Scanner sc = new Scanner(System.in);
	ArrayList<OrderDetail> lineItems;

public Order() {
}

public Order (int orderID, LocalDate orderDate, OrderDetail lineItems, int count, ArrayList<OrderDetail>lineItems) {
	super();
	this.count = count;
	this.lineItems = lineItems;
	this.orderID = orderID;
	this.orderDate = orderDate;
}
public void setorderID(int orderID) {
	this.orderID = orderID;
}
public int getorderID() {
	return orderID;
}
public void setorderDate (localDate orderDate) {
	this.orderID = orderID;
}
public LocalDate getorderDate() {
	return orderDate;
}
public void setlineItems (OrderDetail lineItems) {
	this.lineItems = lineItems;
}
public OrderDetail getlineItems() {
	return lineItems = lineItems;
}
public void setcount (int count) {
	this.count = count;
}
public int getcount() {
	return count;
}
public void addlineItem(Product product, int Quantity) {
	if(lineItems.size()<20) {
		OrderDetail orderdetail = new OrderDetail(product, quantity);
	lineItems.add(new OrderDetail(product, quantity));
	}else 
		System.out.println("Kho đã đầy");
}
public double calcTotalCharge() {
	return quantity*product.getPrice();
}
@Override
public void Nhap() {
	System.out.println("Nhập vào mã của sản phẩm: ");
	setProductID(sc.nextLine());
	System.out.println("Nhập vào mô tả của .sản phẩm: ");
	setDescription(sc.nextline());
	System.out.println("Nhập vào giá tiền của sản phẩm: ");
	setPrice(sc.nextline());
	System.out.println("Nhập vào số lượng sản phẩm: ");
	setQuantity(sc.nextline());
	System.out.println("Nhập vào mã hóa đơn: ");
	orderID = sc.nextInt();
	System.out.println("Ngày hóa đơn được lập: "+orderDate);
}

public void Xuat() {
	System.out.println("Số lượng sản phẩm:"+quantity);
	System.out.println("Mã sản phẩm:"+ productID);
	System.out.println("Mô tả sản phẩm:"+description);
	System.out.println("Giá tiền:"+price);
	System.out.println("Thành tiền:"+calcTotalPrice());
	System.out.println("Mã hóa đơn:"+orderID);
}
@Override
public String toString() {
	return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", count=" + count +", lineItems=" + lineItems +"]";
	}
}
