package exercises/*
Напишите метод, который принимает в качестве параметра число и
возвращает:
• -1 - в случае если число отрицательное;
• О - в случае если число равно О;
• 1 - в случае если число положительное.

 */
fun main(){
    fun znak(x :Double) :Int{
        if(x<0){
            return -1
        }
        if(x >0){
            return 1
        }
        return 0
    }

}
