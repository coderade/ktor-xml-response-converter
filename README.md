# ktor-xml-response-converter

Sample API to return response as XML/Json using Gson/XmlConverter libraries

## Running

To run the application simple use the **Run Application** option on the `Application.kt` file.

## Testing 

To return a json response use:

    curl -H "Accept: application/json" "http://localhost:8080/car"

➜ ` "name":"Nissan Kicks","color":"Gray","fuel":88}%`

To return a xml response use:

    curl -H "Accept: application/xml" "http://localhost:8080/car"

➜ `<Car><name>Nissan Kicks</name><color>Gray</color><fuel>88</fuel></Car>% `
