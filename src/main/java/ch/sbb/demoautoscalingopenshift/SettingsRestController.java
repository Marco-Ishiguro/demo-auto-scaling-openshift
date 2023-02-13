package ch.sbb.demoautoscalingopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SettingsRestController {

  private List<String> text;


  @GetMapping("/memory/{numberOf}")
  public long consumeMemory(@PathVariable long numberOf){
      text = new ArrayList<>();
      System.out.println("consume memory started" + numberOf);
      for(int i = 0; i< numberOf; i++) {
        text.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean tempor massa quis mattis laoreet. Nullam maximus a leo vitae molestie. Sed ac nisi aliquam dolor vestibulum varius " +
            "eget quis leo. Sed eu urna gravida, iaculis purus at, ornare turpis. Nam finibus scelerisque suscipit. Fusce porttitor eros eget dignissim dignissim. Nunc nibh turpis, eleifend vel " +
            "porta at, feugiat eget odio. Donec lacinia tellus ac eleifend accumsan. Donec vulputate quam vel lectus rhoncus ultricies. In id augue vel lorem malesuada pellentesque. Pellentesque " +
            "habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.\n" +
            "\n" +
            "Vestibulum et turpis non turpis feugiat mattis. Phasellus pharetra, dolor sit amet ornare pretium, magna risus maximus metus, eu rhoncus urna massa lacinia metus. Interdum et malesuada" +
            " fames ac ante ipsum primis in faucibus. Phasellus ornare libero sed mollis elementum. Aenean sit amet commodo metus. Nam eu interdum nunc. Nulla luctus elit sit amet est tincidunt " +
            "rutrum. Nulla in mollis augue. Aliquam suscipit purus est, non placerat mauris posuere eget. Morbi convallis, tortor in rhoncus congue, magna ex vestibulum ante, sed tempor lectus " +
            "lorem eget ante. Phasellus vulputate accumsan eros at euismod. Curabitur nec sagittis metus.\n" +
            "\n" +
            "Pellentesque consectetur interdum elit, varius gravida ante egestas tempus. Aenean pellentesque, augue sit amet commodo gravida, velit nisl interdum erat, sed convallis tortor ipsum et" +
            " lacus. Aliquam erat volutpat. Maecenas viverra porta nisl in ornare. Vestibulum rhoncus mauris magna, sed ultrices ex luctus vel. Ut ac pulvinar justo. Sed eget nisi convallis lorem " +
            "vehicula venenatis venenatis eu mi. Fusce turpis massa, aliquam in suscipit quis, iaculis sed diam. Nam finibus leo eget nisl mollis mattis bibendum at eros. Etiam sollicitudin eu " +
            "ligula sit amet laoreet. Mauris suscipit est ac massa tincidunt tempus. Donec id dictum tortor. Nam interdum diam et nulla dapibus accumsan. Donec non blandit lectus, vel vulputate " +
            "odio.\n" +
            "\n" +
            "Nulla pretium accumsan ex vitae pretium. Etiam aliquam felis eros, nec scelerisque libero convallis eget. Aenean hendrerit fringilla velit, semper maximus nibh lacinia in. Sed ac est " +
            "enim. Quisque a sem tempus, ultricies turpis id, ultricies lacus. Quisque convallis egestas tortor, quis accumsan tellus tincidunt at. Sed sagittis sapien velit, vehicula suscipit " +
            "tortor facilisis vitae. Pellentesque ac odio convallis, commodo urna sed, ultrices arcu.\n" +
            "\n" +
            "Aliquam sit amet pretium mauris, egestas mattis orci. Mauris interdum vulputate ante in lobortis. Vivamus sed facilisis felis, in vestibulum ligula. Aenean sed nibh egestas, rutrum " +
            "ligula posuere, accumsan felis. Vivamus consectetur sed libero at ornare. Praesent mi leo, vehicula sed sapien faucibus, sodales pharetra libero. Integer sit amet mauris sed lorem " +
            "commodo vulputate. In viverra eros eget elit bibendum gravida. Sed ante quam, dictum et venenatis vitae, pellentesque ut ante. Nunc nec sollicitudin libero, quis viverra eros. Donec " +
            "ligula velit, interdum dignissim est iaculis, sodales faucibus leo. Nam eget lorem et sem eleifend hendrerit. Curabitur sodales enim ut varius ultricies. Vivamus eleifend nulla sed " +
            "vulputate suscipit. Nam porta augue ex, nec sodales metus posuere non. Nunc non nisi quis arcu egestas porta nec in mi.");
      }
      return numberOf;
    }

  @GetMapping("/cpu/{max}")
  public String consumeCPU(@PathVariable long max){
    long num1 = 0, num2 = 1;

    long counter = 0;

    // Iterate till counter is N
    while (counter < max) {

      // Print the number
      System.out.println(num1 + " ");

      // Swap
      long num3 = num2 + num1;
      num1 = num2;
      num2 = num3;
      counter = counter + 1;
    }
    return "done "+counter;
  }


}