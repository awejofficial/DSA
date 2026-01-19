# [Java Stdin and Stdout II](https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true)
## Easy
<div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>In this challenge, you must read an <em>integer</em>, a <em>double</em>, and a <em>String</em> from stdin, then print the values according to the instructions in the <em>Output Format</em> section below. To make the problem a little easier, a portion of the code is provided for you in the editor.</p>

<p><strong>Note:</strong> We recommend completing <a href="https://www.hackerrank.com/challenges/java-stdin-and-stdout-1">Java Stdin and Stdout I</a> before attempting this challenge.</p></div></div></div><div class="challenge_input_format"><div class="msB challenge_input_format_title"><p><strong>Input Format</strong></p></div><div class="msB challenge_input_format_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>There are three lines of input:     </p>

<ol>
<li>The first line contains an <em>integer</em>.        </li>
<li>The second line contains a <em>double</em>.     </li>
<li>The third line contains a <em>String</em>.</li>
</ol></div></div></div><div class="challenge_output_format"><div class="msB challenge_output_format_title"><p><strong>Output Format</strong></p></div><div class="msB challenge_output_format_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>There are three lines of output:</p>

<ol>
<li>On the first line, print <code>String:</code> followed by the unaltered <em>String</em> read from stdin.      </li>
<li>On the second line, print <code>Double:</code> followed by the unaltered <em>double</em> read from stdin.     </li>
<li>On the third line, print <code>Int:</code> followed by the unaltered <em>integer</em> read from stdin.</li>
</ol>

<p>To make the problem easier, a portion of the code is already provided in the editor.    </p>

<p><strong>Note:</strong> If you use the <em>nextLine()</em> method immediately following the <em>nextInt()</em> method, recall that <em>nextInt()</em> reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next <em>nextLine()</em> will be reading the remainder of the integer line (which is empty).</p></div></div></div><div class="challenge_sample_input"><div class="msB challenge_sample_input_title"><p><strong>Sample Input</strong></p></div><div class="msB challenge_sample_input_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><pre><code>42
3.1415
Welcome to HackerRank's Java tutorials!
</code></pre></div></div></div><div class="challenge_sample_output"><div class="msB challenge_sample_output_title"><p><strong>Sample Output</strong></p></div><div class="msB challenge_sample_output_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><pre><code>String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
</code></pre></div></div></div></div>