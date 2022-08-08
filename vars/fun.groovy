import java.util.Date

def ourDateStamp(String format)
{
    d = new Date()
    tz = TimeZone.getTimeZone('GMT')
    if(format.equals('ddmmyy')
    {
        return d.format('dd/MM/yy', tz)
    }
    if(format.equals('mmddyy')
    {
        return d.format('MM/dd/yy', tz)
    }
}
