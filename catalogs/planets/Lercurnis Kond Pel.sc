Planet	"Pel/Lercurnis B VII"
{
	ParentBody     "Kond"
	Class          "Jupiter"
	Mass            391
	Radius          7.47e+04
	InertiaMoment   0.249
	Obliquity       -0.152
	EqAscendNode    164
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel.cfg"
		SurfStyle       0.225
		Randomize      (-0.595, 1.176, -1.511)
		detailScale     256
		tropicLatitude  0
		icecapLatitude  0.9
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.49
		stripeFluct     1.13
		stripeTwist     3
		cycloneMagn     1.53
		cycloneFreq     0.55
		cycloneDensity  0.458
		cycloneOctaves  10
		cycloneMagn2     0
		cycloneFreq2     0
		cycloneLatitude2 0
		cycloneOctaves2  0
		BumpHeight      11.9
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.102
		Velocity        -27
		BumpHeight      4.42
		Gamma           0.6
		Hapke           0.634
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.198
		mainFreq        2.4
		mainOctaves     20
		Coverage        0.237
		stripeZones     6.49
		stripeFluct     1.13
		stripeTwist     3
	}

	Clouds
	{
		Height          0.102
		Velocity        -366
		BumpHeight      4.42
		Hapke           0.611
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.443
		mainFreq        2.4
		mainOctaves     20
		Coverage        0.237
		stripeZones     6.49
		stripeFluct     1.13
		stripeTwist     3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel"
		Height          500
		Density         1e+04
		Pressure        1e+06
		Bright          2
		Opacity         0.2
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	91.9
			He        	7.78
			CH4       	0.295
			N2        	0.0359
			NH3       	0.0277
			O2        	0.00743
			C2H2      	0.00308
			C2H4      	0.00142
			Ne        	0.00112
			Ar        	0.000842
			C2H6      	0.000588
			C8H18     	0.000348
			C3H8      	0.000328
			H2O       	3.83e-06
			H2S       	1.9e-06
			CO2       	1.54e-06
			Kr        	3.93e-07
			Xe        	4.81e-08
			SO2       	1.13e-08
			CO        	3.67e-10
			Cl2       	3.3e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  10
	}

	Aurora
	{
		Height         1e+03
		NorthLat       90
		NorthLon       0
		NorthRadius    2e+04
		NorthWidth     1.09e+04
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 68.8
		NorthMoveSpeed 1.17
		NorthParticles 100000
		SouthLat       -90
		SouthLon       0
		SouthRadius    1.92e+04
		SouthWidth     1.07e+04
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 68
		SouthMoveSpeed 1.49
		SouthParticles 100000
		TopColor    (1.000 0.000 0.000)
		BottomColor (0.406 0.000 1.000)
	}

	Rings
	{
		InnerRadius     1.26e+05
		OuterRadius     5.12e+05
		EdgeRadius      5.12e+05
		MeanRadius      2.54e+05
		Thickness       7.04
		RocksMaxSize    0.179
		RocksSpacing    29.2
		DustDrawDist    2e+04
		ChartRadius     1.35e+05
		RotationPeriod  6.03
		Brightness      1
		FrontBright     1
		BackBright      10
		Density         0.00111
		Opacity         0.000869
		SelfShadow      1
		PlanetShadow    0.473
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       17.9
		densityScale    3.28
		densityOffset   -0.992
		densityPower    0.308
		colorContrast   0.0153
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
		Period          0.3526875
		SemiMajorAxis   0.216139601
		Eccentricity    0
		Inclination     -0.152067873
		AscendingNode   164.055176
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

