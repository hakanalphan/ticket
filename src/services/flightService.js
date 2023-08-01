import axios from "axios";

export default class FlightService {
    getFlights() {
        return axios.get("http://localhost:8081/flights/getall");
    }
}