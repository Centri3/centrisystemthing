Moon	"Sow/Lercurnis B VII III"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.0734239966
	Radius          2835.3999
	InertiaMoment   0.336180001
	Obliquity       0.1
	EqAscendNode    178.625954
	TidalLocked     true

	AlbedoBond      0.4
	AlbedoGeom      0.46
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_sow.cfg"
		SurfStyle       0.0245
		Randomize      (-0.107, -0.877, -0.527)
		colorDistMagn   0.0799
		colorDistFreq   333
		detailScale     128
		drivenDarkening 0
		seaLevel        0.00763
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  0.763
		icecapHeight    0.13
		climatePole     1
		climateTropic   0.275
		climateEquator  1
		climateSteppeMin -1
		climateSteppeMax 0.649
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0
		heightTempGrad  1
		beachWidth      0
		tropicWidth     0
		mainFreq        1.18
		venusFreq       1.14
		venusMagn       0.617
		mareFreq        6.64
		mareDensity     0.0465
		terraceProb     0.409
		erosion         0.119
		montesMagn      0.1
		montesFreq      150
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.054
		dunesFreq       26.1
		dunesFraction   0.798
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      1
		riversFreq      8.24
		riversSin       7
		riftsMagn       100
		riftsFreq       7
		riftsSin        7
		canyonsMagn     0.027
		canyonsFreq     83.9
		canyonsFraction 0.974
		cracksMagn      0
		cracksFreq      0.3
		cracksOctaves   15
		craterMagn      0.1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.4
		volcanoFreq     1.05
		volcanoDensity  0.191
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     3.39
		cycloneFreq     0.826
		cycloneDensity  0.391
		cycloneOctaves  0
		BumpHeight      20
		BumpOffset      3.36
		DiffMapAlpha   "Water"
		SpecBrightWater 1
		SpecBrightIce   0.85
		RoughnessWater  0.489
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.46
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.153
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	100
		}
	}

	Clouds
	{
		Height          11.9
		Velocity        1e-07
		RotationOffset  166
		BumpHeight      3.71
		Gamma           10
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		SpotBrightCB    2
		SpotWidthCB     0.03
		DayAmbient      0.07
		SubsurfScatBright 0.137
		SubsurfScatPower  100
		ModulateColor  (0.656 0.656 0.656)
		ModulateBright  1
		mainFreq        0.481
		mainOctaves     10
		Coverage        0
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel Sow"
		Height          100
		Density         4.22529993e-08
		Pressure        5
		Greenhouse      34.3510017
		Bright          5
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			N2        	90
			O2        	8
			CO2       	1
			H2O       	1
		}
	}

	Climate
	{
		GlobalWindSpeed  28.7
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.77915288
		SemiMajorAxisKm 876708.476
		Eccentricity    0.001
		Inclination     0.1
		AscendingNode   178.625954
		ArgOfPericenter 0
		MeanAnomaly     -57.7099237
	}
}

