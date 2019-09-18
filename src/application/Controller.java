package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller
{
	@FXML
	Button Calculate;

	@FXML
	Button Reset;

	@FXML
	TextField Name1;

	@FXML
	TextField Name2;

	@FXML
	TextField Name3;

	@FXML
	TextField Name4;

	@FXML
	TextField Name5;

	@FXML
	TextField Name6;

	@FXML
	TextField Name7;

	@FXML
	TextField Name8;

	@FXML
	TextField Name9;

	@FXML
	TextField Name10;

	@FXML
	TextField Name11;

	@FXML
	TextField Name12;

	@FXML
	TextField Grade1;

	@FXML
	TextField Grade2;

	@FXML
	TextField Grade3;

	@FXML
	TextField Grade4;

	@FXML
	TextField Grade5;

	@FXML
	TextField Grade6;

	@FXML
	TextField Grade7;

	@FXML
	TextField Grade8;

	@FXML
	TextField Grade9;

	@FXML
	TextField Grade10;

	@FXML
	TextField Grade11;

	@FXML
	TextField Grade12;

	@FXML
	TextField Percent1;

	@FXML
	TextField Percent2;

	@FXML
	TextField Percent3;

	@FXML
	TextField Percent4;

	@FXML
	TextField Percent5;

	@FXML
	TextField Percent6;

	@FXML
	TextField Percent7;

	@FXML
	TextField Percent8;

	@FXML
	TextField Percent9;

	@FXML
	TextField Percent10;

	@FXML
	TextField Percent11;

	@FXML
	TextField Percent12;

	@FXML
	TextField Average;

	/*
	 *///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// */

	public void name1(ActionEvent evt)
	{
	}

	public void name2(ActionEvent evt)
	{
	}

	public void name3(ActionEvent evt)
	{
	}

	public void name4(ActionEvent evt)
	{
	}

	public void name5(ActionEvent evt)
	{
	}

	public void name6(ActionEvent evt)
	{
	}

	public void name7(ActionEvent evt)
	{
	}

	public void name8(ActionEvent evt)
	{
	}

	public void name9(ActionEvent evt)
	{
	}

	public void name10(ActionEvent evt)
	{
	}

	public void name11(ActionEvent evt)
	{
	}

	public void name12(ActionEvent evt)
	{
	}

	public void grade1(ActionEvent evt)
	{
	}

	public void grade2(ActionEvent evt)
	{
	}

	public void grade3(ActionEvent evt)
	{
	}

	public void grade4(ActionEvent evt)
	{
	}

	public void grade5(ActionEvent evt)
	{
	}

	public void grade6(ActionEvent evt)
	{
	}

	public void grade7(ActionEvent evt)
	{
	}

	public void grade8(ActionEvent evt)
	{
	}

	public void grade9(ActionEvent evt)
	{
	}

	public void grade10(ActionEvent evt)
	{
	}

	public void grade11(ActionEvent evt)
	{
	}

	public void grade12(ActionEvent evt)
	{
	}

	public void percent1(ActionEvent evt)
	{
	}

	public void percent2(ActionEvent evt)
	{
	}

	public void percent3(ActionEvent evt)
	{
	}

	public void percent4(ActionEvent evt)
	{
	}

	public void percent5(ActionEvent evt)
	{
	}

	public void percent6(ActionEvent evt)
	{
	}

	public void percent7(ActionEvent evt)
	{
	}

	public void percent8(ActionEvent evt)
	{
	}

	public void percent9(ActionEvent evt)
	{
	}

	public void percent10(ActionEvent evt)
	{
	}

	public void percent11(ActionEvent evt)
	{
	}

	public void percent12(ActionEvent evt)
	{
	}

	public void average(ActionEvent evt)
	{
	}

	public void getAverage()
	{
		double average;

		if (Grade1.getText().equals("") && Percent1.getText().equals(""))
		{
			Average.setText(Double.toString(0));
		}
		else if (Grade2.getText().equals("") && Percent2.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());

			double p1 = Double.valueOf(Percent1.getText());
			average = p1 * g1 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade3.getText().equals("") && Percent3.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade4.getText().equals("") && Percent4.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade5.getText().equals("") && Percent5.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade6.getText().equals("") && Percent6.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade7.getText().equals("") && Percent7.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade8.getText().equals("") && Percent8.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());
			double g7 = Double.valueOf(Grade7.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());
			double p7 = Double.valueOf(Percent7.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100
					+ p7 * g7 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade9.getText().equals("") && Percent9.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());
			double g7 = Double.valueOf(Grade7.getText());
			double g8 = Double.valueOf(Grade8.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());
			double p7 = Double.valueOf(Percent7.getText());
			double p8 = Double.valueOf(Percent8.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100
					+ p7 * g7 / 100 + p8 * g8 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade10.getText().equals("") && Percent10.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());
			double g7 = Double.valueOf(Grade7.getText());
			double g8 = Double.valueOf(Grade8.getText());
			double g9 = Double.valueOf(Grade9.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());
			double p7 = Double.valueOf(Percent7.getText());
			double p8 = Double.valueOf(Percent8.getText());
			double p9 = Double.valueOf(Percent9.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100
					+ p7 * g7 / 100 + p8 * g8 / 100 + p9 * g9 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade11.getText().equals("") && Percent11.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());
			double g7 = Double.valueOf(Grade7.getText());
			double g8 = Double.valueOf(Grade8.getText());
			double g9 = Double.valueOf(Grade9.getText());
			double g10 = Double.valueOf(Grade10.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());
			double p7 = Double.valueOf(Percent7.getText());
			double p8 = Double.valueOf(Percent8.getText());
			double p9 = Double.valueOf(Percent9.getText());
			double p10 = Double.valueOf(Percent10.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100
					+ p7 * g7 / 100 + p8 * g8 / 100 + p9 * g9 / 100 + p10 * g10 / 100;
			Average.setText(Double.toString(average));
		}
		else if (Grade12.getText().equals("") && Percent12.getText().equals(""))
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());
			double g7 = Double.valueOf(Grade7.getText());
			double g8 = Double.valueOf(Grade8.getText());
			double g9 = Double.valueOf(Grade9.getText());
			double g10 = Double.valueOf(Grade10.getText());
			double g11 = Double.valueOf(Grade11.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());
			double p7 = Double.valueOf(Percent7.getText());
			double p8 = Double.valueOf(Percent8.getText());
			double p9 = Double.valueOf(Percent9.getText());
			double p10 = Double.valueOf(Percent10.getText());
			double p11 = Double.valueOf(Percent11.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100
					+ p7 * g7 / 100 + p8 * g8 / 100 + p9 * g9 / 100 + p10 * g10 / 100 + p11 * g11 / 100;
			Average.setText(Double.toString(average));
		}
		else
		{
			double g1 = Double.valueOf(Grade1.getText());
			double g2 = Double.valueOf(Grade2.getText());
			double g3 = Double.valueOf(Grade3.getText());
			double g4 = Double.valueOf(Grade4.getText());
			double g5 = Double.valueOf(Grade5.getText());
			double g6 = Double.valueOf(Grade6.getText());
			double g7 = Double.valueOf(Grade7.getText());
			double g8 = Double.valueOf(Grade8.getText());
			double g9 = Double.valueOf(Grade9.getText());
			double g10 = Double.valueOf(Grade10.getText());
			double g11 = Double.valueOf(Grade11.getText());
			double g12 = Double.valueOf(Grade12.getText());

			double p1 = Double.valueOf(Percent1.getText());
			double p2 = Double.valueOf(Percent2.getText());
			double p3 = Double.valueOf(Percent3.getText());
			double p4 = Double.valueOf(Percent4.getText());
			double p5 = Double.valueOf(Percent5.getText());
			double p6 = Double.valueOf(Percent6.getText());
			double p7 = Double.valueOf(Percent7.getText());
			double p8 = Double.valueOf(Percent8.getText());
			double p9 = Double.valueOf(Percent9.getText());
			double p10 = Double.valueOf(Percent10.getText());
			double p11 = Double.valueOf(Percent11.getText());
			double p12 = Double.valueOf(Percent12.getText());

			average = p1 * g1 / 100 + p2 * g2 / 100 + p3 * g3 / 100 + p4 * g4 / 100 + p5 * g5 / 100 + p6 * g6 / 100
					+ p7 * g7 / 100 + p8 * g8 / 100 + p9 * g9 / 100 + p10 * g10 / 100 + p11 * g11 / 100
					+ p12 * g12 / 100;
			Average.setText(Double.toString(average));
		}
	}

	public void reset()
	{
		Name1.clear();
		Name2.clear();
		Name3.clear();
		Name4.clear();
		Name5.clear();
		Name6.clear();
		Name7.clear();
		Name8.clear();
		Name9.clear();
		Name10.clear();
		Name11.clear();
		Name12.clear();

		Grade1.clear();
		Grade2.clear();
		Grade3.clear();
		Grade4.clear();
		Grade5.clear();
		Grade5.clear();
		Grade6.clear();
		Grade7.clear();
		Grade8.clear();
		Grade9.clear();
		Grade10.clear();
		Grade11.clear();
		Grade12.clear();

		Percent1.clear();
		Percent2.clear();
		Percent3.clear();
		Percent4.clear();
		Percent5.clear();
		Percent5.clear();
		Percent6.clear();
		Percent7.clear();
		Percent8.clear();
		Percent9.clear();
		Percent10.clear();
		Percent11.clear();
		Percent12.clear();

		Average.clear();
	}

	public void calculateButton(ActionEvent evt)
	{
		getAverage();
	}

	public void resetButton(ActionEvent evt)
	{
		reset();
	}

	public void keys(KeyEvent e)
	{
		if (e.getCode() == KeyCode.ENTER)
		{
			getAverage();
		}
		if (e.getCode() == KeyCode.DELETE)
		{
			reset();
		}
	}
}
