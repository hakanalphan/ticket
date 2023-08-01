import axios from "axios";

export default class AirplaneService {
    getAirplanes() {
        return axios.get("http://localhost:8081/airplanes/getall");
    }
}