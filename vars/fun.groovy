import java.util.Date

def ourDateStamp(String format)
{
    d = new Date()
    if(format.equals('ddmmyy')
    {
        return d.format('dd/MM/yy')
    }
    if(format.equals('mmddyy')
    {
        return d.format('MM/dd/yy')
    }
}
