package by.itstep.javatraining.revision.task;

/*	Task 10. Caterpillar [гусеница]
 *
 *	Гусеница ползёт по вертикальному шесту высотой H метров,
 *	поднимаясь за день на A метров, а за ночь спускаясь на B метров.
 *	На какой день гусеница доползёт до вершины шеста?
 *
 *	Примечание
 *	Все величины должны быть положительными и удовлетворять условиям: H > B и A > B.
 *  Можно попробовать реализовать алгоритм в одну строчку.
 *
 *	Формат входных данных [input]
 *	На вход даются целые числа H, A, B в диапазоне int, причем H > B и A > B.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено одно натуральное число или 0 в случае некорректных данных.
 *
 *	[ input 1]: 10 3 2
 *	[output 1]: 8
 *
 *	[ input 2]: 4 2 3
 *	[output 2]: 0
 *
 *	[ input 3]: 1 3 2
 *	[output 3]: 0
 */

public class Task10 {
    public static int task10(int h, int a, int b) {
        if (h <= b || a <= b || h <= 0 || a <= 0 || b <= 0) {
            return 0;
        }
        return (h - a - 1) / (a - b) + 2;
    }
}