function showObjProperty(Obj){
    var PropertyList='';
    for(var i in Obj){
        if(Obj.i !=null)
            PropertyList=PropertyList+i+'属性：'+Obj.i+'\r\n';
        else
            PropertyList=PropertyList+i+'方法\r\n';
    }
    console.log(PropertyList);
}