/*2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
*/

package student_Tigran_Poghosyan.javaClasses.mainTask1;

public class SortCostumer {
    public static void main(String[] args) {

        Costumer tigranPoghosyan = new Costumer("Tigran", "Poghosyan", "Samveli", "avangard 4", 1234_5678_9100_1112L, "1234567891234569");
        Costumer tigranPetrosyan = new Costumer("Tigran", "Babajanyan", "Armeni", "shopron 2", 4321_8765_6543_2589L, "123456789321");
        Costumer armenDallaqyan = new Costumer("Armen", "Dallaqyan", "karen", "Halabyan 11", 9876_6541_5585_6798L, "654789621456");
        Costumer artakSimonyan = new Costumer("Artak", "Simonyan", "Harut", "goris", 5695_9874_6696_5555L, "987456215654");
        Costumer hakobVardanyan = new Costumer("Hakob", "Axajanyan", "Armeni", "Tex", 5695_9574_6696_8978L, "987456219841");

        Costumer[] costomers = tigranPetrosyan.createCostomersList(tigranPetrosyan, tigranPoghosyan, armenDallaqyan, artakSimonyan, hakobVardanyan);


        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            boolean thereAreChanges = false;
            for (int i = 0; i < costomers.length - 1; i++) {
                Costumer saveFirstPoint;
                String firstLetter = costomers[i].getSurName();
                if (costomers[i].getSurName().charAt(0) > costomers[i + 1].getSurName().charAt(0)) {
                    saveFirstPoint = costomers[i];
                    costomers[i] = costomers[i + 1];
                    costomers[i + 1] = saveFirstPoint;
                    thereAreChanges = true;
                }
            }
            if (thereAreChanges) {
                sorted = false;
            }

        }
        System.out.println();
        System.out.println("sort all costumers by surname");
        int i = 1;
        for (Costumer x : costomers) {
            System.out.println(i++ + " " + x.getSurName() + "  " + x.getName() + " " + x.getFatherLand());

        }
    }
}
