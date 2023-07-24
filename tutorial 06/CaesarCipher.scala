

object CaesarCipher{
  def encrypt(plainText:String,shift:Int):String={
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val encryptedText=new StringBuilder
    plainText.map { char =>
      if(char.isLetter){
        val isUpperCase=char.isUpper
        val index=alphabet.indexOf(char.toUpper)
        val shiftedIndex=(index+shift)%alphabet.length
        val encryptedChar=alphabet(shiftedIndex)
        encryptedText.append(if(isUpperCase) encryptedChar else encryptedChar.toLower)

      }else{
        encryptedText.append(char)
      }

    }
    encryptedText.toString()
  }
  def decrypt(encryptedText:String,shift:Int): String = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val decryptedText =new StringBuilder
    encryptedText.map { char =>
      if (char.isLetter) {
        val isUpperCase = char.isUpper
        val index = alphabet.indexOf(char.toUpper)
        val shiftedIndex = (index - shift +alphabet.length) % alphabet.length
        val decryptedChar = alphabet(shiftedIndex)
        decryptedText.append(if (isUpperCase) decryptedChar else (decryptedChar.toLower))

      }else{
        decryptedText.append(char)
      }

    }
    decryptedText.toString()
  }
  def cipher(text:String,shift:Int,operation:(String,Int)=>String):String={
    operation(text,shift)
  }
  def main(args:Array[String]): Unit = {
    println("enter String :")
    val plainText=scala.io.StdIn.readLine()
    println(cipher(plainText,3,encrypt))
    println(cipher(cipher(plainText,3,encrypt),3,decrypt))
  }

}