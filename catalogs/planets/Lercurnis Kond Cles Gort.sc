Planet	"Gort/Lercurnis B VIIIb"
{
	ParentBody     "Cles-Gort bar"
	Class          "Terra"
	Mass            10
	Radius          12329
	InertiaMoment   0.32755
	Oblateness      0.014567
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

    Interior
    {
        Composition
        {
            Hydrogen    0
            Helium      0
            Carbides    0
            Ices        10
            Silicates   65
            Metals      25
        }
    }

	Surface
	{
		Preset         "lercurnis_kond_cles_gort.cfg"
		SurfStyle       0.019051
		Randomize      (-0.601, 0.180, -0.439)
		colorDistMagn   0.066438
		colorDistFreq   1610
		detailScale     128
		drivenDarkening 0.26718
		seaLevel        -0.015267
		snowLevel       2
		tropicLatitude  0.48157
		icecapLatitude  2
		icecapHeight    0.4016
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3899
		heightTempGrad  0.625
		beachWidth      0.00057348
		tropicWidth     0.07
		mainFreq        2.7099
		venusFreq       2
		venusMagn       1.145
		mareFreq        1
		mareDensity     1
		terraceProb     0.15287
		erosion         0
		montesMagn      0.2451
		montesFreq      100
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.044626
		dunesFreq       83.833
		dunesFraction   0.95479
		hillsMagn       1.6794
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      58.29
		riversFreq      3.0634
		riversSin       6.3492
		riftsMagn       52.068
		riftsFreq       2.9285
		riftsSin        6.0653
		eqridgeMagn     0.38168
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0.62144
		canyonsFreq     4.5131
		canyonsFraction 0.74324
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   0
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.49618
		volcanoMagn     0
		volcanoFreq     0
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.7918
		cycloneFreq     0.81653
		cycloneDensity  0.40536
		cycloneOctaves  2
		BumpHeight      10.728
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.62215
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.39695
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.33588
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.45341
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.35115
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Cles Gort"
		Height          50
		Density         1.1267e-09
		Pressure        1e-09
		Greenhouse      0.0050058
		Bright          5
		Opacity         1
		SkyLight        0.16667
		Hue             0
		Saturation      1

		Composition
		{
			N2        	98
			CO2       	1
			SO2       	1
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0601782471
		SemiMajorAxis   0.0231973454
		Eccentricity    0.05
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

