package myAnswer

object Caser_Chiper {
   def main(args:Array[String]): Unit = 
    {
    println("You encrypted message is : "+ct);
    println("You decrypted message is : "+pt);
    
     
    }

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  val msg = "hello word"
  
  val Encryp=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  
  val Decryp=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
  
  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
  val ct=cipher(Encryp,msg,2,alphabet)
  val pt=cipher(Decryp,ct,1,alphabet)
}