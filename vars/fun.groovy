import java.util.Date

def ourDateStamp(String format)
{
   println("we in the methude")
   def d = new Date()
    if(format.equals('ddmmyy'))
    {
        println("ddmmyy"
        return d.format('dd/MM/yy')
    }
    if(format.equals('mmddyy'))
    {
        println("mmddyy")
        return d.format('MM/dd/yy')
    }
}
