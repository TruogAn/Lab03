package thuchanh3;

public class Menu {
	public void danhSach() {
		Scanner sc = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("1.Thêm sản phẩm đi bae");
			System.out.println("2.Chủ quán tính tiền");
			System.out.println("3.Danh sách của sản phẩm");
			System.out.println("4.Thoát");
			System.out.println("Bạn muốn thực hiện gì: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				thuchanh3.Order Order = new order();
				Order.Nhap();
				break;
			}
	
		}while (chon != 0);
		}

}
