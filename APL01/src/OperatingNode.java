package src;

public class OperatingNode extends BinaryNode {

    // construtor que recebe um valor numérico
    public OperatingNode(Float value) {
        super(value);  // chama o construtor da superclasse com o valor
    }

    // construtor que também recebe o nó pai
    public OperatingNode(Float value, BinaryNode parent) {
        super(value, parent);  // chama o construtor da superclasse
    }

    // implementação do método visit() para retornar o valor do nó
    @Override
    public float visit() {
        return (float) getValue();  // retorna o valor numérico
    }
}