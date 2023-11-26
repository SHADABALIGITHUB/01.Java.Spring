const apiUrl = 'https://api.ipregistry.co/?key=vg4bvblwhg42d7b0';

// Function to fetch data from the API


const fetchData = async () => {
    try {
      const response = await fetch(apiUrl);
  
      // Check if the request was successful (status code 200-299)
      if (!response.ok) {
        throw new Error(`Error: ${response.status} - ${response.statusText}`);
      }
  
      // Parse the JSON data from the response
      const body = await response.json();
  
  
  
      // Handle the data as needed
      console.log(`country name : ${body.location.country.name}`)
    
      return body.location.country.name;
    } catch (error) {
      console.error('Error fetching data:', error.message);
    }
  };


  export default fetchData





// Call the fetchData function