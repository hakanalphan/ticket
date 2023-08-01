import axios from "axios";

export default class CustomerService {
    getCustomers() {
        return axios.get("http://localhost:8081/customers/getall");
    }
}