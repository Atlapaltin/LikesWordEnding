fun main() {
    val likes = 79
    val result = if ((likes % 10) == 1 && (likes % 100) !=11) ("����������� $likes ��������")
    else ("����������� $likes �����")
        println (result)
}