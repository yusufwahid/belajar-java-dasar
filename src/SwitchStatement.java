public class SwitchStatement {

  public static void main(String[] args) {

    String nilai = "B";

    switch (nilai) {
      case "A":
        System.out.println("Wow, Anda Lulus dengan Baik");
        break;
      case "B":
      case "C":
        System.out.println("Nilai Anda Cukup Baik");
        break;
      case "D":
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin Anda Salah Jurusan");
    }

    //switch lambda
    switch (nilai) {
      case "A" -> System.out.println("Wow, Anda Lulus dengan Baik");
      case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
      case "D" -> System.out.println("Anda Tidak Lulus");
      default -> {
        System.out.println("Mungkin Anda Salah Jurusan");
      }
    }

    String ucapan;
    switch (nilai) {
      case "A" -> ucapan = "Wow, Anda Lulus dengan Baik";
      case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
      case "D" -> ucapan = "Anda Tidak Lulus";
      default -> {
        ucapan = "Mungkin Anda Salah Jurusan";
      }
    }

    System.out.println(ucapan);

    ucapan = switch (nilai) {
      case "A" :
        yield "Wow, Anda Lulus dengan Baik";
      case "B", "C" :
        yield "Nilai Anda Cukup Baik";
      case "D" :
        yield "Anda Tidak Lulus";
      default : {
        yield "Mungkin Anda Salah Jurusan";
      }
    };

    System.out.println(ucapan);
  }
}
