package view;

import java.time.LocalDate;

public class StartView {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); //���� ��¥
		System.out.println();
		System.out.println("         ������������"+now+"������������   "); //���� ��¥ ���
		System.out.println();
		MenuView.menu();


	}

}
