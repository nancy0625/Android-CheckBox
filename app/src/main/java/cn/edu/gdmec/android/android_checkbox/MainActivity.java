package cn.edu.gdmec.android.android_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //注册监听事件
    public void OnCheckboxClicked(View view){
        //判断哪个CheckBox被选中
        CheckBox checkBox = ((CheckBox)view);
        boolean checked = checkBox.isChecked();
        switch(view.getId()){
            case R.id.checkBox:
                if (checked){
                    Toast.makeText(MainActivity.this,"我喜欢"+((CheckBox)view).getText(),Toast.LENGTH_SHORT).show();
                }else {
                    //remove from container
                }
                break;
            case R.id.checkBox2:
                if (checked){
                    Toast.makeText(MainActivity.this,"我喜欢"+checkBox.getText(),Toast.LENGTH_SHORT).show();
                }else {

                }
                break;
            case R.id.checkBox3:
                if (checked){
                    Toast.makeText(MainActivity.this,"我喜欢"+checkBox.getText(),Toast.LENGTH_SHORT).show();
                }else {

                }
                break;
            case R.id.checkBox4:
                if (checked){
                    Toast.makeText(MainActivity.this,"我喜欢"+checkBox.getText(),Toast.LENGTH_SHORT).show();
                }else {

                }
                break;
        }
    }
}
