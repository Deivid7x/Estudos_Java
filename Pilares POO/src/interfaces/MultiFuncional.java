package interfaces;

// Com interfaces, podemos herdar (através do implements) caracteristicas/métodos de mais de uma interface ao mesmo tempo, coisa que é impossivel através de classes. Mas lembre-se, as classes pais devem ser interfaces e não classes. ( Confira os demais arquivos de pacote) 

// Segue abaixo um exemplo de implementação

public class MultiFuncional implements Digitalizadora, Impressora, Scanner{

    // Devemos implementar as classes que as interfaces exigem, semelhante ao que fazemos com classes abstratas
    
    public void digitalizar() {
        System.out.println("Digitalizando pela multifuncional");
        
    }
    
    public void scannear() {
        System.out.println("Scanneando pela multifuncional");
    }

    
    public void imprimir() {
        System.out.println("Imprimindo pela multifuncional");
    }
    
}
