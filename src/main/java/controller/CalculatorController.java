package controller;

import model.CalculatorModel;
import view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try {
                theModel.parse(theView.getInputString());
                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("Sorry! Smth gone wrong");
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        }
    }
}
