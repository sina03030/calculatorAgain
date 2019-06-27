package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button plusBt;
    Button equalBt;
    Button minesBtn;
    Button btnMultiply;
    Button btnDivide;
    Button clean;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

    Integer firstInput;
    Integer secondInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        buttonsNumber();

        //-----> CLEAN
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( !(editText.equals("") )){
                editText.setText("");

                }
            }
        });

        //-----> SUM
        plusBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.equals("")){
                    return;
                }
                getFirstInput();
                editText.setText("");
                equalBt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText.equals("")){
                            return;
                        }
                        getSecondInput();
                        int sum = secondInput + firstInput;
                        if (sum > 999999999){
                            Toast.makeText(MainActivity.this, "ERROR : result number is too long", Toast.LENGTH_LONG).show();
                            return;
                        }
                        editText.setText(Integer.toString(sum));
                    }
                });
            }


        });




        //-----> MINES
        minesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.equals("")){
                    return;
                }
                getFirstInput();
                editText.setText("");
                equalBt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText.equals("")){
                            return;
                        }
                        getSecondInput();
                        int sum = firstInput - secondInput;
                        if (sum > 999999999){
                            Toast.makeText(MainActivity.this, "ERROR : result number is too long", Toast.LENGTH_LONG).show();
                            return;
                        }
                        editText.setText(Integer.toString(sum));
                    }
                });
            }
        });

        //-----> MULTIPLY
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.equals("")){
                    return;
                }
                getFirstInput();
                editText.setText("");
                equalBt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText.equals("")){
                            return;
                        }
                        getSecondInput();
                        int sum = secondInput * firstInput;
                        if (sum > 999999999){
                            Toast.makeText(MainActivity.this, "ERROR : result number is too long", Toast.LENGTH_LONG).show();
                            return;
                        }
                        editText.setText(Integer.toString(sum));
                    }
                });
            }
        });

        //-----> DIVIDE
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.equals("")){
                    return;
                }
                getFirstInput();
                editText.setText("");
                equalBt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText.equals("")){
                            return;
                        }
                        getSecondInput();
                        int sum = firstInput / secondInput;
                        if (sum > 999999999){
                            Toast.makeText(MainActivity.this, "ERROR : result number is too long", Toast.LENGTH_LONG).show();
                            return;
                        }
                        editText.setText(Integer.toString(sum));
                    }
                });
            }
        });
    }

    private int getFirstInput() {
        String inputToText = editText.getText().toString().trim();
        if (isNumber(inputToText) == false) {
            Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
            inputToText = "0";
        }
        firstInput = Integer.parseInt(inputToText);
        return firstInput;
    }

    private int getSecondInput() {
        String inputToText = editText.getText().toString().trim();
        if (isNumber(inputToText) == false) {
            inputToText = "0";
            Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
        }
        secondInput = Integer.parseInt(inputToText);
        return secondInput;

    }

    private boolean isNumber(String str){

        for (int i = 0; i < str.length(); i++) {
            if ( !('0'<=str.charAt(i) && '9'>= str.charAt(i)) ){
                return false;
            }
        }
        return true;
    }

    private void init() {
        plusBt = findViewById(R.id.plus_bt);
        equalBt = findViewById(R.id.equal_bt);
        editText = findViewById(R.id.edit_text);
        minesBtn = findViewById(R.id.mines_btn);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        clean = findViewById(R.id.clean);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
    }

    private void buttonsNumber() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
    }


}