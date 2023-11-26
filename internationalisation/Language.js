import * as English from './english.js'
import * as Russian from './russian.js'
import * as French from './french.js'
import * as Dutch from './dutch.js'
import * as Arabic from './arabic.js'
import fetchData from '../util/fetchCountry.js'

var element1 , element2 , element3 , placeholder;


// const country = getCountry();
var country = await fetchData().then((country) => {
    console.log(country)
    return country
})


console.log(country)

if(country.includes("France")){
    element1 = French.element1
    element2 = French.element2
    element3 = French.element3
    placeholder = French.placeholder
}else if(country.includes("Russia")){
    element1 = Russian.element1
    element2 = Russian.element2
    element3 = Russian.element3
    placeholder = Russian.placeholder
}else if(country.includes("Netherlands")){
    element1 = Dutch.element1
    element2 = Dutch.element2
    element3 = Dutch.element3
    placeholder = Dutch.placeholder
}else if(country.includes("United States")){
    element1 = Arabic.element1
    element2 = Arabic.element2
    element3 = Arabic.element3
    placeholder = Arabic.placeholder
}
else{
    element1 = English.element1
    element2 = English.element2
    element3 = English.element3
    placeholder = English.placeholder
}

console.log(element1)

export default {element1,element2,element3,placeholder}