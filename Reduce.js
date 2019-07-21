function grow(x){
    const reducer  = (accumulator,currentValue) => accumulator + currentValue;
    return x.reduce(reducer);
}

let array = [1,2,3];
console.log(grow(array));