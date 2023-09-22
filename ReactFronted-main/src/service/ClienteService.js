import axios from 'axios';

const CLIENTE_BASE_REST_API_URL = "http://localhost:9090/api/v1/clientes"; 
const CLIENTE_BASE_REST_API_URL_POST = "http://localhost:9090/api/v1/clientes/mandar"; 
const CLIENTE_BASE_REST_API_URL_GET_ID = "http://localhost:9090/api/v1/clientes/"; 
const CLIENTE_BASE_REST_API_URL_UPDATE = "http://localhost:9090/api/v1/clientes/buscar/"; 
const CLIENTE_BASE_REST_API_URL_DELETE = "http://localhost:9090/api/v1/clientes/eliminar/"; 
class ClienteService {
getAllClientes(){
    return axios.get(CLIENTE_BASE_REST_API_URL); 
}
createCliente (cliente){
return axios.post(CLIENTE_BASE_REST_API_URL_POST,cliente);
}


obtenerId(ClienteId){
    return axios.get(CLIENTE_BASE_REST_API_URL_GET_ID + ClienteId);
}
SaveUpdateCliente(ClienteId, cliente) {
 return axios.put(CLIENTE_BASE_REST_API_URL_UPDATE  + ClienteId , cliente); 
}

deleteCliente(ClienteId) {
    return axios.delete(CLIENTE_BASE_REST_API_URL_DELETE  + ClienteId); 
}


}
export default new ClienteService();







    