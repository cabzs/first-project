package controller;

import java.sql.SQLException;
import java.util.List;

import model.dto.Revenue;
import model.service.RevenueService;
import model.service.RevenueServiceImpl;
import view.FailView;

public class RevenueController {

	private static RevenueService revenueService = new RevenueServiceImpl();

	public static void getRevenue() {
		try {
			int total = revenueService.selectTotalRevenue();
			List<Revenue> dailyTotal = revenueService.selectDailyRevenue();
			List<Revenue> monthlyTotal = revenueService.selectMonthlyRevenue();
			List<Revenue> yearlyTotal = revenueService.selectYearlyReenue();
			//~~~.~~~(total, dailyTotal, monthlyTotal, yearlyTotal);
			System.out.println("         = ��ü ���� =       ");
			System.out.println("      ["+total+"�� �Դϴ�]      ");
			System.out.println();
			System.out.println("         = �� ���� =       ");
			System.out.println(dailyTotal);
			System.out.println();
			System.out.println("         = �� ���� =       ");
			System.out.println(monthlyTotal);
			System.out.println();
			System.out.println("         = �� ���� =       ");
			System.out.println(yearlyTotal);

		} catch (SQLException e) {
			FailView.errorMessage("");
		} catch (Exception e) {

		}

	}

}
