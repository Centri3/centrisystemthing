Planet	"Pel/Lercurnis B VII"
{
	ParentBody     "Kond"
	Class          "Jupiter"
	Mass            391.33
	Radius          74683
	InertiaMoment   0.24879
	Obliquity       -0.15207
	EqAscendNode    164.06
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel.cfg"
		SurfStyle       0.22538
		Randomize      (0.303, 0.815, 0.105)
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
		stripeZones     0.30534
		stripeFluct     0.21374
		stripeTwist     3
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		cycloneMagn2     0
		cycloneFreq2     0
		cycloneLatitude2 0
		cycloneOctaves2  0
		BumpHeight      11.852
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
		Coverage        0.23664
		stripeZones     0.30534
		stripeFluct     0.21374
		stripeTwist     3
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
		Coverage        0.23664
		stripeZones     0.30534
		stripeFluct     0.21374
		stripeTwist     3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel"
		Height          1000
		Density         10000
		Pressure        1e+06
		Bright          2
		Opacity         0.2
		SkyLight        1
		Hue             0
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
		OuterRadius     3.4976e+05
		EdgeRadius      3.4976e+05
		MeanRadius      2.0029e+05
		Thickness       7.036
		RocksMaxSize    0.17861
		RocksSpacing    29.218
		DustDrawDist    2723.4
		ChartRadius     1.3525e+05
		RotationPeriod  6.0297
		Brightness      1
		FrontBright     1
		BackBright      10
		Density         0.0011112
		Opacity         0.00086882
		SelfShadow      1
		PlanetShadow    0.47328
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
		Period          0.3526875
		SemiMajorAxis   0.216139601
		Eccentricity    0
		Inclination     -0.152067873
		AscendingNode   164.055176
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

