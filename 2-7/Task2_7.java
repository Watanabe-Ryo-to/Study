/**
* Task2-7 : 課題内容
*
* 本課題では、配列の使い方を学んでいきましょう。
* 問①から問⑥まであります。
* 指定された値と変数名を守って記述して下さい。
*
* 問⑤,⑥については、コメントを入れて下さい。
*
*/
public class Task2_7
{
    public static void main(String[] args) 
    {
        // ①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値
        String[] strArray = {"JAPAN", "AMERICA", "KOREA", "ENGLAND"};   

        // ② ①で作成した配列の要素数を出力して下さ
        System.out.println(strArray.length);    

        /* ③下記の値を保持した、要素数3のStringクラスの配列strArray
         * 1番目（先頭）の要素に 「りんご」 を代入
         * 2番目の要素に 「もも」 を代入
         * 3番目の要素に 「ぶどう」 を代入
         */ 
        strArray = null;
        strArray = new String[3];
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";

        // ④ ③で作成した配列の3番目の要素を出力しなさい。 
        System.out.println(strArray[2]);
        
        /* ⑤下記の処理について、何をしているのかコメントを記入して下
         * int型5つを初期化付きでまとめて（配列）宣言
         */
        int[] intArray = { 10, 20, 30, 40, 50 };    

        // ⑥下記の処理について、何をしているのかコメントを記入して下さ
        // 配列の0番目（10）と4番目（50）の和（60）の出力
        System.out.println(intArray[0] + intArray[4]);  

    }
}

