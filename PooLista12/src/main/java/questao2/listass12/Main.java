/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.listass12;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        Funcionario luiz = new Vendedor("Luiz", 1000, 0.1);
        Funcionario paula = new Vendedor("Paula", 1200, 0.07);
        Venda venda1 = new Venda(100);
        Venda venda2 = new Venda(200);
        Venda venda3 = new Venda(280);
        Venda venda4 = new Venda(300);
        Venda venda5 = new Venda(500);
        
        ((Vendedor) luiz).incluirVenda(venda1);
        ((Vendedor) luiz).incluirVenda(venda2);
        ((Vendedor) paula).incluirVenda(venda3);
        ((Vendedor) paula).incluirVenda(venda4);
        ((Vendedor) paula).incluirVenda(venda5);
        
        Funcionario julio = new Programador("Julio", 1000);
        Funcionario ana = new Programador("Ana", 1000);
        Funcionario anderson = new Programador("Anderson", 1200);
        ((Programador) julio).incluirLinguagem("C");
        ((Programador) julio).incluirLinguagem("Java");
        ((Programador) ana).incluirLinguagem("C#");
        ((Programador) ana).incluirLinguagem("Java");
        ((Programador) anderson).incluirLinguagem("Python");
        
        Funcionario jose = new Funcionario("Jose", 1000);
        Funcionario maria  = new Funcionario("Maria", 1400);
        
        Empresa empresa = new Empresa("Empresa");
        empresa.incluirFuncionario(luiz);
        empresa.incluirFuncionario(paula);
        empresa.incluirFuncionario(julio);
        empresa.incluirFuncionario(ana);
        empresa.incluirFuncionario(anderson);
        empresa.incluirFuncionario(jose);
        empresa.incluirFuncionario(maria);
        
        System.out.println("Custo total salarios: R$: " + 
                empresa.calcularCustosSalarios() + "\n");
        
        System.out.println("Salarios: ");
        for(int i =  0;  i < empresa.getSize(); i++) {
            System.out.println(empresa.getFuncionarios().get(i).getNome() + 
                    ": R$" + empresa.getFuncionarios().get(i).calcularSalario() );
        }
        
        System.out.println("Percentual Comissão dos Vendedores: ");
        for(int i = 0; i < empresa.getSize(); i++) {
            if(empresa.getFuncionarios().get(i) instanceof Vendedor){
                System.out.println(empresa.getFuncionarios().get(i).getNome() + ": " +
                        ((Vendedor)empresa.getFuncionarios().get(i)).getPercentualComissao());
            }
        }
        
        System.out.println("Linguagens dos Programadores: ");
        for(int i = 0; i < empresa.getSize(); i++) {
            if(empresa.getFuncionarios().get(i) instanceof Programador) {
                System.out.print(empresa.getFuncionarios().get(i).getNome() + ": ");
                for(int j = 0; j <((Programador)empresa.getFuncionarios().get(i)).getSize(); j++)  {
                    System.out.print(((Programador)empresa.getFuncionarios().get(i)).getLinguagens().get(j) + "  ");
                }
            System.out.println();
            }
        }
    }
}
