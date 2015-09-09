<!doctype html>
<html>
<!-- comentario -->
	<head>
		<title>concentrece
		</title>
	</head>
	<body>
		<table border='1'>
			<?php

					$veri= array(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
					$p=1;
					for ($i=0; $i<6; $i++){
						for ($j=0; $j<6; $j++){
							while ( $p == 1) {
								$num=rand(0,17);
								$veri[$num]=$veri[$num]+1;
								if ($veri[$num] <= 2){
									$juego[$i][$j]=$num+1;
									$p=0;
								} else {$p=1;}
							}
							$p=1;
						}
					}
					/*for ($i=0; $i<6; $i++){
						for ($j=0; $j<6; $j++){
							echo $juego[$i][$j]."\t";
						}
						echo "\n";
					}*/
			$k=0;
			$l=0;
			$h=0;
			$r="0";
$t="corona";
			//echo "<pre>";
			if(isset($_GET["id"])) {
				$r = $_GET['id'] ;
			} else {
				$r = "0";
			}
			$y= (int)$r[0];
			if(strlen($r) == 2){
				$o=$r[1];
			} else if (strlen($r) == 3){
				$o = $r[1] . $r[2];
			} else {
				$h=1;
			}
for($i=0; $i < 6; $i++) {
		echo "<tr>";
	for($j=0; $j < 6; $j++) {
		if ($h == 0 ){
			if ($y== 0){
				if($y==$i & $o==$j){
					$t = strval($juego[$i][$j]);
				} else {
					$t = "corona";
				}
			} else if($y>= 0 & $y==$i & ($o % ($y*6))==$j){
				$t = strval($juego[$i][$j]);
			}else {
				$t = "corona";
			}
		}
		echo <<<TAG
<td>
		<a href='fg.php?id=$k$l'>
		<img src= '$t.png'>
		</a>
		</td>
TAG;
		$l++;
	}
	echo "</tr>";
	$k++;
}

			?>
</table>

	</body>
</html>