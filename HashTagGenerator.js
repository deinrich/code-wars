function generateHashtag (str){
    if (str.length === 0 || str.length > 140){
        return false;
    }
    var i;
    for (i = 0; i < str.length; i++) {

        if(str.charAt(i) == ' ' && str.charAt(i+1) > 'Z'){
            str.slice(0,i) + (str.charAt(i+1) - 32).toString() + str.slice(i+2,str.length);
            document.write('itworks');
        }
        if(str.charAt(i) == ' '){
            str = str.slice(0,i)+ str.slice(i+1,str.length);
        }
    }
    return '#'+str;
}

document.write(generateHashtag('Hello world'));