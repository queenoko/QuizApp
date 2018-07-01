package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.android.quizapp.R.id.checkbox_plant;

public class MainActivity extends AppCompatActivity {

    //Declares answers for radio group options and edit options

    final int answerQtnOne = R.id.camel_radio_button;
    final int answerQtnTwo = R.id.sun_radio_button;
    final int answerQtnThree = R.id.gold_radio_button;
    final int answerQtnFour = R.id.skin_radio_button;
    final int answerQtnFive = R.id.nile_radio_button;
    final int answerQtnSix = R.id.yes_radio_button;
    final String answerQtnEight = "insect";
    final String answerQtnNine = "methane";
    final String answerQtnTen = "fermentation";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /// Logic for right and wrong answers

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitAnswer(View view) {

        ArrayList<String> wrongAnswersList = new ArrayList<String>();

        int numOfRightAns = 0;

        if (checkQtnOne()){
            numOfRightAns ++;
        }else{
            wrongAnswersList.add("Question 1");
        }

        if (checkQtnTwo()){
            numOfRightAns ++;
        }else {
            wrongAnswersList.add("Question 2");
        }

        if (checkQtnThree()){
            numOfRightAns ++;
        }else{
            wrongAnswersList.add("Question 3");
        }

        if (checkQtnFour()){
            numOfRightAns ++;
        }else{
            wrongAnswersList.add("Question 4");
        }

        if (checkQtnFive()){
            numOfRightAns ++;
        }else {
            wrongAnswersList.add("Question 5");
        }

        if (checkQtnSix()){
            numOfRightAns ++;
        }else {
            wrongAnswersList.add("Question 6");
        }

        if (checkQtnSeven()){
            numOfRightAns ++;
        }else{
            wrongAnswersList.add("Question 7");
        }

        if (checkQtnEight()){
            numOfRightAns ++;
        }else {
            wrongAnswersList.add("Question 8");
        }

        if (checkQtnNine()){
            numOfRightAns ++;
        }else {
            wrongAnswersList.add("Question 9");
        }

        if (checkQtnTen()){
            numOfRightAns ++;
        }else{
            wrongAnswersList.add("Question 10");
        }

    //Stores the wrong answer in a string message

    StringBuilder sbr = new StringBuilder();
    for (String s : wrongAnswersList){

        sbr.append(s);
        sbr.append("\n");
    }

    //This string will be displayed in a toast
    Context context = getApplicationContext();

    if(numOfRightAns < 1){
        CharSequence text = "Very Poor, better luck next time." + sbr.toString();
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }else if(numOfRightAns <= 4){
        CharSequence text = "Fair, better luck next time." + sbr.toString();
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }else if(numOfRightAns <=9){
        CharSequence text = "Nice work, better luck next time." + sbr.toString();
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }else if(numOfRightAns >9){
        CharSequence text = "Congratulations!!! You got all the answers correctly." + sbr.toString();
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }else{
        CharSequence text = "Keep Trying!!! You got " + numOfRightAns + "/10 answers right.\n\nCheck again the following:\n " +sbr.toString();
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    }

    //This method resets the Questions

    public void resetQ(View view) {

        RadioGroup radioBtnOne = (RadioGroup) findViewById(R.id.radioQtnOne);
        radioBtnOne.clearCheck();

        RadioGroup radioBtnTwo = (RadioGroup) findViewById(R.id.radioQtnTwo);
        radioBtnTwo.clearCheck();

        RadioGroup radioBtnThree = (RadioGroup) findViewById(R.id.radioQtnThree);
        radioBtnThree.clearCheck();

        RadioGroup radioBtnFour = (RadioGroup) findViewById(R.id.radioQtnFour);
        radioBtnFour.clearCheck();

        RadioGroup radioBtnFive = (RadioGroup) findViewById(R.id.radioQtnFive);
        radioBtnFive.clearCheck();

        RadioGroup radioBtnSix = (RadioGroup) findViewById(R.id.radioQtnSix);
        radioBtnSix.clearCheck();

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_bird);
        checkBox.setChecked(false);

        CheckBox cb = (CheckBox) findViewById(R.id.checkbox_box);
        cb.setChecked(false);

        CheckBox  cx = (CheckBox) findViewById(checkbox_plant);
        cx.setChecked(false);

        EditText edt = (EditText) findViewById(R.id.edt_one);
        edt.setText("");

        EditText e = (EditText) findViewById(R.id.edt_two);
        e.setText("");

        EditText et = (EditText) findViewById(R.id.edt_three);
        et.setText("");

    }

    //This method checks if answer  1- 10 is true

    private boolean checkQtnOne(){
        RadioGroup radioBtnOne = (RadioGroup) findViewById(R.id.radioQtnOne);
        if (radioBtnOne.getCheckedRadioButtonId() == answerQtnOne){
            return true;
        }
        return false;
    }

    private boolean checkQtnTwo(){
        RadioGroup radioBtnTwo = (RadioGroup) findViewById(R.id.radioQtnTwo);
        if (radioBtnTwo.getCheckedRadioButtonId() == answerQtnTwo){
            return true;
        }
        return false;
    }

    private boolean checkQtnThree(){
        RadioGroup radioBtnThree = (RadioGroup) findViewById(R.id.radioQtnThree);
        if (radioBtnThree.getCheckedRadioButtonId() == answerQtnThree){
            return true;
        }
        return false;
    }

    private boolean checkQtnFour(){
        RadioGroup radioBtnFour = (RadioGroup) findViewById(R.id.radioQtnFour);
        if (radioBtnFour.getCheckedRadioButtonId() == answerQtnFour){
            return true;
        }
        return false;
    }

    private boolean checkQtnFive(){
        RadioGroup radioBtnFive = (RadioGroup) findViewById(R.id.radioQtnFive);
        if (radioBtnFive.getCheckedRadioButtonId() == answerQtnFive){
            return true;
        }
        return false;
    }

    private boolean checkQtnSix(){
        RadioGroup radioBtnSix = (RadioGroup) findViewById(R.id.radioQtnSix);
        if (radioBtnSix.getCheckedRadioButtonId() == answerQtnSix){
            return true;
        }
        return false;
    }

    private boolean checkQtnSeven(){
        CheckBox checkBtnBird = (CheckBox) findViewById(R.id.checkbox_bird);
        CheckBox checkBtnBox = (CheckBox) findViewById(R.id.checkbox_box);
        CheckBox checkBtnPlant = (CheckBox) findViewById(checkbox_plant);

        if (checkBtnBird.isChecked() && checkBtnPlant.isChecked() && !checkBtnBox.isChecked()){
            return true;
        }
        return false;
    }

    private boolean checkQtnEight(){
        EditText edt = (EditText) findViewById(R.id.edt_one);

        return edt.getText().toString().trim().equalsIgnoreCase(answerQtnEight);
    }

    private boolean checkQtnNine(){
        EditText edt = (EditText) findViewById(R.id.edt_two);

        return edt.getText().toString().trim().equalsIgnoreCase(answerQtnNine);
    }

    private boolean checkQtnTen(){
        EditText edt = (EditText) findViewById(R.id.edt_three);

        return edt.getText().toString().trim().equalsIgnoreCase(answerQtnTen);
    }
}
