def ourDateStamp(string format){
    def d = new Date(0)
     def tz = TimeZone.getTimeZone('GMT')
    if(format.toChat(0)=='M' && format.toChat(1)=='M') 
        return d.format('MMM/dd/yyyy', tz)
    else if(format.toChat(2)=='M' && format.toChat(3)=='M')
        return d.format('dd/MMM/yyyy', tz)
    else:
        return "wrong fornat"
}