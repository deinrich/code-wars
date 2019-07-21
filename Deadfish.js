function parse( data )
{
    let num = 0;
    let output = new Array();
    for (let i = 0; i < data.length; i++) {
        switch (data.charAt(i)) {
            case 'i':
                num++;
                break;
            case 'd':
                num--;
                break;
            case 's':
                num *= num;
                break;
            case 'o':
                output.push(num);
                break;
            default:
                break;
        }
    }
return output;
}

var map = {
    'i' : function(x){return x + 1;},
    'd' : function(x){return x - 1;},
    's' : function(x){return x * x;}
}

function parse( data )
{
    var array = [], val = 0;
    data.split('').forEach(function(x){
        if(x === 'o'){
            array.push(val);
        } else {
            val = map[x](val);
        }
    });
    return array;
}

parse("iiisdoso");
