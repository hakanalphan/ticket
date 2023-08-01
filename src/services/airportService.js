import axios from "axios";

export default class AirportService {
    getAirports() {
        return axios.get("http://localhost:8081/airports/getall");
    }
}