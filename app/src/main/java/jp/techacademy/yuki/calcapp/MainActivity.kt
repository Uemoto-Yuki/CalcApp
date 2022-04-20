package jp.techacademy.yuki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var num1 : Float = 0.0f
    var num2 : Float = 0.0f
    var ans : Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        //ボタン1~4にクリックを検知する能を与える

    }
    override fun onClick(v: View) {

         try {
             when(v.id){

            R.id.button1 -> {
                num1 = editText1.text.toString().toFloat()
                num2 = editText2.text.toString().toFloat()
                ans = num1 + num2
            }
            R.id.button2 -> {
                num1 = editText1.text.toString().toFloat()
                num2 = editText2.text.toString().toFloat()
                ans = num1 - num2
            }
            R.id.button3 -> {
                num1 = editText1.text.toString().toFloat()
                num2 = editText2.text.toString().toFloat()
                ans = num1 * num2
            }
            R.id.button4 -> {
                num1 = editText1.text.toString().toFloat()
                num2 = editText2.text.toString().toFloat()
                ans = num1 / num2
             }
             }
             val intent = Intent(this, SecondActivity::class.java)
             intent.putExtra("VALUE1", ans)
             startActivity(intent)

         }catch(e:Exception){
             textView2.text = "数値を入力してください"
         }


    }


}



/*2つの画面があり、1つ目の画面に数値2つと演算子を選ぶと、
次の画面で計算結果を表示する四則計算アプリを作成してください。
・画面を2つ作成してください
・1つ目の画面では、数値入力用の2つのEditTextと、
・四則計算それぞれのボタンを4つ作成してください
・4つの四則計算ボタンのどれかをタップすると、
　2つ目の画面へ移動させてTextViewで対応する計算結果を表示してください
・数値は小数点に対応してください
・EditTextに何も値が入っていない場合、
四則計算ボタンをタップしてもエラーが起きないようにしてください。
ヒント
レイアウトファイルで、EditTextにandroid:inputType="属性値"を適用すると、
数値や小数点、マイナスの値などの入力を制御できます。
複数の入力制御を組み合わせたい場合には|でつなげて記述できます。
 */




