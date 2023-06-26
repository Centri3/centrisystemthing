Planet	"Cles/Lercurnis B VIII"
{
	ParentBody     "Kond"
	Class          "Jupiter"
	Mass            1167.4

	Surface
	{
		Preset         "lercurnis_kond_cles.cfg"
	}

	NoOcean         true

	Clouds
	{
		Height          0.10156
		Velocity        -27.019
		BumpHeight      4.4161
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		mainFreq        3
		mainOctaves     15
		Coverage        0.13174
		stripeZones     0.30534
		stripeFluct     0.21374
		stripeTwist     12.897
	}

	Clouds
	{
		Height          0.10156
		Velocity        -365.89
		BumpHeight      4.4162
		Gamma           0.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		mainFreq        3
		mainOctaves     15
		Coverage        0.13174
		stripeZones     0.30534
		stripeFluct     0.21374
		stripeTwist     12.897
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          915.87
		Density         10000
		Pressure        1e+06
		Bright          2
		Opacity         0.2
		SkyLight        1
		Hue             -0.14122
		Saturation      1

		Composition
		{
			H2        	91.851
			He        	7.7756
			CH4       	0.29476
			N2        	0.035874
			NH3       	0.027693
			O2        	0.0074259
			C2H2      	0.0030776
			C2H4      	0.0014153
			Ne        	0.001125
			Ar        	0.00084191
			C2H6      	0.00058834
			C8H18     	0.00034848
			C3H8      	0.00032808
			H2O       	3.8317e-06
			H2S       	1.9014e-06
			CO2       	1.5355e-06
			Kr        	3.9323e-07
			Xe        	4.8065e-08
			SO2       	1.1265e-08
			CO        	3.6731e-10
			Cl2       	3.3009e-10
		}
	}

	Aurora
	{
		Height         96.439
		NorthLat       90
		NorthLon       0
		NorthRadius    20015
		NorthWidth     10920
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 68.782
		NorthMoveSpeed 1.1719
		NorthParticles 100000
		SouthLat       -90
		SouthLon       0
		SouthRadius    19154
		SouthWidth     10660
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 67.982
		SouthMoveSpeed 1.4904
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     1.2567e+05
		OuterRadius     7.3786e+05
		EdgeRadius      7.3786e+05
		MeanRadius      3.2953e+05
		Thickness       1
		RocksMaxSize    0.01
		RocksSpacing    2.5
		DustDrawDist    3000
		ChartRadius     1.3525e+05
		RotationPeriod  6.0297
		Brightness      1
		FrontBright     1
		BackBright      10
		Density         1
		Opacity         1
		SelfShadow      0.99318
		PlanetShadow    0.32824
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       3.545
		densityScale    2.5191
		densityOffset   0.076336
		densityPower    1.4982
		colorContrast   0
		FrontColor      (1.000 1.000 1.000)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.705375
	}
}

