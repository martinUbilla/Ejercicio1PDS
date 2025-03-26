public interface IEmpleadoDAO {
    void agregarEmpleado(Empleado empleado);
    Empleado obtenerEmpleado(String nombre);
    void eliminarEmpleado(String nombre);
    void actualizarEmpleado(Empleado empleado );
}
